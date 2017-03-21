package hk.com.kycheungal.girlsfrontline.module;

/**
 * Created by User on 21/3/2017.
 */

public class GirlListItem {
    private String Name;
    private int iconID, lv, skillLv;




    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setSkillLv(int skillLv) {
        this.skillLv = skillLv;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public String getName() {
        return Name;
    }

    public int getIconID() {
        return iconID;
    }

    public int getLv() {
        return lv;
    }

    public int getSkillLv() {
        return skillLv;
    }
}
