package pl.javastart.jpaoptimalization.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT DISTINCT c FROM Country c LEFT JOIN FETCH c.cities ORDER BY c.name")
    List<Country> findAllCountriesWithBiggestCity();

    @Query("SELECT DISTINCT c FROM Country c LEFT JOIN FETCH c.languages ORDER BY c.name")
    List<Country> findAllCountriesWithLanguages();

}
