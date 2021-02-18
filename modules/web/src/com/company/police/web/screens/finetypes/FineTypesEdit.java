package com.company.police.web.screens.finetypes;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.FineTypes;

@UiController("police_FineTypes.edit")
@UiDescriptor("fine-types-edit.xml")
@EditedEntityContainer("fineTypesDc")
@LoadDataBeforeShow
public class FineTypesEdit extends StandardEditor<FineTypes> {
}