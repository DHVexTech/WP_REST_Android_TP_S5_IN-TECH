package fr.intech.s5.backend.hotel.intech.Backendhotelintech.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("fr.intech.s5.backend.hotel.intech.Backendhotelintech.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
