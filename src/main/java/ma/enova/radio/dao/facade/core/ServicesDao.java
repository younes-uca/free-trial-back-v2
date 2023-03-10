package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.Services;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ServicesDao extends AbstractRepository<Services, Long> {
    Services findByCode(String code);

    int deleteByCode(String code);


    @Query(value = "SELECT MAX(item.ordre) FROM Services item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
