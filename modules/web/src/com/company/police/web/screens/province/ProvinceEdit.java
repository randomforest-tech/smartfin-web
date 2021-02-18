package com.company.police.web.screens.province;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Province;

@UiController("police_Province.edit")
@UiDescriptor("province-edit.xml")
@EditedEntityContainer("provinceDc")
@LoadDataBeforeShow
public class ProvinceEdit extends StandardEditor<Province> {
}