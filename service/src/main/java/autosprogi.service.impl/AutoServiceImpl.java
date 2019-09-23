package autosprogi.service.impl;

import autosprogi.dao.AutoDAO;
import autosprogi.model.Auto;
import exception.AutoNemTalalhato;
import exception.RosszDatum;
import exception.RosszEvjarat;
import exception.RosszRendszam;
import service.AutoService;

import java.util.ArrayList;
import java.util.Collection;

public class AutoServiceImpl implements AutoService {
    private AutoDAO dao;

    public AutoServiceImpl(AutoDAO dao) {
        this.dao = dao;
    }

    public Collection<Auto> listAllAuto() {
        return dao.readAllAutos();
    }

    public Auto getAuto(String rendszam) throws RosszRendszam {
        return null;
    }

    public void addAuto(Auto auto) throws RosszDatum, RosszEvjarat, RosszRendszam {

    }

    public void deleteAuto(Auto auto) throws AutoNemTalalhato {

    }

    public Collection<Auto> listAllAutoByManufacturer(String manufacturer) {
        Collection<Auto> allAuto = dao.readAllAutos();
        Collection <Auto> result = new ArrayList<Auto>();
        for (Auto a : allAuto) {
            if (a.getMarka().equalsIgnoreCase(manufacturer)) {
                result.add(a);
            }
        }
        return result;
    }
}
