package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageKey> {

    @Query("SELECT DISTINCT c FROM CountryLanguage c ORDER BY c.language")
    List<CountryLanguage> findAllCountriesWithLanguages();
}
