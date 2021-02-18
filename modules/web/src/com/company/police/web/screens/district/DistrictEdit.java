package com.company.police.web.screens.district;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.District;

@UiController("police_District.edit")
@UiDescriptor("district-edit.xml")
@EditedEntityContainer("districtDc")
@LoadDataBeforeShow
public class DistrictEdit extends StandardEditor<District> {
}