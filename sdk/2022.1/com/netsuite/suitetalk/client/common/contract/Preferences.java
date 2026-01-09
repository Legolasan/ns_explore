/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

public interface Preferences {
    public void setDisableMandatoryCustomFieldValidation(boolean var1);

    public void setDisableSystemNotesForCustomFields(boolean var1);

    public void setIgnoreReadOnlyFields(boolean var1);

    default public void setRunServerSuiteScriptAndWorkflowTriggers(boolean runServerSuiteScriptAndWorkflowTriggers) {
        throw new UnsupportedOperationException("Preference runServerSuiteScriptAndWorkflowTriggers is only available from endpoint 2016.2.");
    }

    public void setWarningAsError(boolean var1);
}

