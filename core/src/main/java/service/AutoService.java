package service;

import autosprogi.model.Auto;
import exception.AutoNemTalalhato;
import exception.RosszDatum;
import exception.RosszEvjarat;
import exception.RosszRendszam;

import java.util.Collection;

public interface AutoService {
    public Collection<Auto> listAllAuto();
    public Auto getAuto(String rendszam) throws RosszRendszam;
    public void addAuto(Auto auto)throws RosszDatum, RosszEvjarat, RosszRendszam;
    public void deleteAuto(Auto auto) throws AutoNemTalalhato;
    public Collection<Auto> listAllAutoByManufacturer(String manufacturer);
}
