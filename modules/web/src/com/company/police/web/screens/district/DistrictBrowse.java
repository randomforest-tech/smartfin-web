package com.company.police.web.screens.district;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.District;

@UiController("police_District.browse")
@UiDescriptor("district-browse.xml")
@LookupComponent("districtsTable")
@LoadDataBeforeShow
public class DistrictBrowse extends StandardLookup<District> {
}