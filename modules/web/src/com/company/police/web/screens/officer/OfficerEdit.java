package com.company.police.web.screens.officer;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Officer;

@UiController("police_Officer.edit")
@UiDescriptor("officer-edit.xml")
@EditedEntityContainer("officerDc")
@LoadDataBeforeShow
public class OfficerEdit extends StandardEditor<Officer> {
}