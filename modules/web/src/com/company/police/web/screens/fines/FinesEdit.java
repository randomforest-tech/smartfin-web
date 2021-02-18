package com.company.police.web.screens.fines;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Fines;

@UiController("police_Fines.edit")
@UiDescriptor("fines-edit.xml")
@EditedEntityContainer("finesDc")
@LoadDataBeforeShow
public class FinesEdit extends StandardEditor<Fines> {
}