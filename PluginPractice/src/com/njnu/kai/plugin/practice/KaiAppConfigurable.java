package com.njnu.kai.plugin.practice;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author hongkai.qian
 * @version 1.0.0
 * @since 16-7-16
 */
public class KaiAppConfigurable implements Configurable {


    @Nls
    @Override
    public String getDisplayName() {
        return "Kai全局setting";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return "kai help topic";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        final HelloWorldConfigurationForm helloWorldConfigurationForm = new HelloWorldConfigurationForm();
        return helloWorldConfigurationForm.getRootView();
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {
    }

    @Override
    public void reset() {
    }

    @Override
    public void disposeUIResources() {
    }

}
