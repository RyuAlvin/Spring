package cn.di.pojo;

import java.util.List;

public class City {
    private List<District> districtList;

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return "City{" +
                "districtList=" + districtList +
                '}';
    }
}
