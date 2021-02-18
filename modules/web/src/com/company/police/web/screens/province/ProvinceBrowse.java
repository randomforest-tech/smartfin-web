package com.company.police.web.screens.province;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Province;

@UiController("police_Province.browse")
@UiDescriptor("province-browse.xml")
@LookupComponent("provincesTable")
@LoadDataBeforeShow
public class ProvinceBrowse extends StandardLookup<Province> {
}