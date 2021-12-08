package entities;

import java.io.Serializable;
import java.util.Objects;



public class Search_pr implements Serializable {

    private String pr_name;
    private String fio;
    private String about;

    private String name_org;

    public Search_pr() {
    }

    public Search_pr(String name, String mat, String price, String org) {

        this.pr_name = name;
        this.fio = mat;
        this.about = price;
        this.name_org = org;

    }

    public String getPr_name() {
        return this.pr_name;
    }

    public void setPr_name(String secondName) {
        pr_name = secondName;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String name) {
        this.fio = name;
    }

    public String getAbout() {
        return this.about;
    }

    public void setinfo(String name) {
        this.about = name;
    }

    public String getName_org() {
        return this.name_org;
    }

    public void setNameOrg(String name) {
        this.name_org = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Search_pr that = (Search_pr) o;
            return Objects.equals(this.pr_name, that.pr_name) && Objects.equals(this.fio, that.fio) && Objects.equals(this.about, that.about) && Objects.equals(this.name_org, that.name_org);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.pr_name, this.fio,this.about,this.name_org);
    }

    public String toString() {
        return "entities.Search_pr{pr_name=" + this.pr_name+  '\''+  ", secondName='" + this.fio +  '\'' + ", pos='" + this.about +  '\'' + this.name_org +  '\'' +'}';    }
}
