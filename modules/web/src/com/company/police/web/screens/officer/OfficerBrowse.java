package com.company.police.web.screens.officer;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Officer;

@UiController("police_Officer.browse")
@UiDescriptor("officer-browse.xml")
@LookupComponent("officersTable")
@LoadDataBeforeShow
public class OfficerBrowse extends StandardLookup<Officer> {
}