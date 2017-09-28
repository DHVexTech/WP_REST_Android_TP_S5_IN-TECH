package fr.intech.s5.tp.ws_rest_android.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by dylan on 26/09/2017.
 */

public class HttpHelper {

    public static String downloadFromFeed(RequestPackage requestPackage) throws IOException
    {

        String address = requestPackage.getEndpoint();

        String encodedParams = requestPackage.getEncodedParams();

        if (requestPackage.getMethod().equals("GET") && encodedParams.length() > 0)
        {
            address = String.format("%s?%s", address, encodedParams);
        }

        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(address);

        if (requestPackage.getMethod().equals("POST"))
        {
            MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
            Map<String, String> params = requestPackage.getParams();
            for (String key : params.keySet())
            {
                builder.addFormDataPart(key, params.get(key));
            }
            RequestBody requestBody = builder.build();
            requestBuilder.method("POST", requestBody);
        }

        Request request = requestBuilder.build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful())
        {
            return response.body().string();
        }
        else
        {
            throw new IOException("Exception : code retour " + response.code());
        }

    }


    public static String downloadUrl(String adress) throws IOException
    {
        InputStream is = null;
        try
        {
            URL url = new URL(adress);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200)
            {
                throw new IOException("Erreur --> Le code retourne par la reponse est different de 200 : " + responseCode);
            }
            is = conn.getInputStream();
            return readStream(is);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if (is != null)
            {
                is.close();
            }
        }
        return null;
    }

    public static String readStream(InputStream stream) throws IOException {
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        BufferedOutputStream out = null;
        try
        {
            int length = 0;
            out = new BufferedOutputStream(byteArray);
            while ((length = stream.read(buffer)) > 0 )
            {
                out.write(buffer, 0, length);
            }
            out.flush();
            return byteArray.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        finally {
            if (out != null)
            {
                if (out != null)
                {
                    out.close();
                }
            }
        }
    }
}
