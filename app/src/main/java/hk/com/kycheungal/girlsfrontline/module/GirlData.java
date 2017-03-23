package hk.com.kycheungal.girlsfrontline.module;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 21/3/2017.
 */

public class GirlData {

    private static final String[] names = {"G41", "M14",
            "Tar-21"} ;
    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete};

    private static final int[] lvs = {85, 100, 90};

    private static final int[] skillLvs = {3, 10, 6};

    public static List<GirlListItem> getListData() {
        List <GirlListItem> data = new ArrayList<>();


            for (int i = 0; i  < names.length && i  < icons.length ; i++) {
                GirlListItem item = new GirlListItem();
                item.setIconID(icons[i]);
                item.setName(names[i]);
                item.setLv(lvs[i]);
                item.setSkillLv(skillLvs[i]);
                data.add(item);
            }

        return data;
    }
}


