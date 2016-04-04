
package org.opencms.ui.editors.messagebundle;

import org.opencms.i18n.A_CmsMessageBundle;
import org.opencms.i18n.I_CmsMessageBundle;

/**
 * Convenience class to access the localized messages of this OpenCms package.<p>
 *
 * @since 10.0.0
 */
public final class Messages extends A_CmsMessageBundle {

    /** Name of the used resource bundle. */
    private static final String BUNDLE_NAME = "org.opencms.ui.editors.messagebundle.messages";

    /** Message constant for key in the resource bundle. */
    public static final String ERR_LOADING_BUNDLE_CMS_OBJECT_NULL_0 = "ERR_LOADING_BUNDLE_CMS_OBJECT_NULL_0";

    /** Static instance member. */
    private static final I_CmsMessageBundle INSTANCE = new Messages();

    /** Message constant for key in the resource bundle. */
    public static final String ERR_FILE_NOT_A_BUNDLE_1 = "ERR_FILE_NOT_A_BUNDLE_1";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_LOADING_BUNDLE_FILENAME_NULL_0 = "ERR_LOADING_BUNDLE_FILENAME_NULL_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_COLUMN_HEADER_KEY_0 = "GUI_COLUMN_HEADER_KEY_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_COLUMN_HEADER_DESCRIPTION_0 = "GUI_COLUMN_HEADER_DESCRIPTION_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_COLUMN_HEADER_TRANSLATION_0 = "GUI_COLUMN_HEADER_TRANSLATION_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_COLUMN_HEADER_DEFAULT_0 = "GUI_COLUMN_HEADER_DEFAULT_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_APP_TITLE_0 = "GUI_APP_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String ERR_UNLOCKING_RESOURCES_0 = "ERR_UNLOCKING_RESOURCES_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_LOADING_RESOURCES_0 = "ERR_LOADING_RESOURCES_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_SAVING_CHANGES_0 = "ERR_SAVING_CHANGES_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_BUNDLE_DESCRIPTOR_NOT_UNIQUE_1 = "ERR_BUNDLE_DESCRIPTOR_NOT_UNIQUE_1";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_UNSUPPORTED_BUNDLE_TYPE_1 = "ERR_UNSUPPORTED_BUNDLE_TYPE_1";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_LANGUAGE_SWITCHER_LABEL_0 = "GUI_LANGUAGE_SWITCHER_LABEL_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_VIEW_SWITCHER_LABEL_0 = "GUI_VIEW_SWITCHER_LABEL_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_VIEW_SWITCHER_EDITMODE_DEFAULT_0 = "GUI_VIEW_SWITCHER_EDITMODE_DEFAULT_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_VIEW_SWITCHER_EDITMODE_MASTER_0 = "GUI_VIEW_SWITCHER_EDITMODE_MASTER_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_KEYSET_SWITCHER_LABEL_0 = "GUI_KEYSET_SWITCHER_LABEL_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_KEYSET_SWITCHER_MODE_ALL_0 = "GUI_KEYSET_SWITCHER_MODE_ALL_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_KEYSET_SWITCHER_MODE_ONLY_USED_0 = "GUI_KEYSET_SWITCHER_MODE_ONLY_USED_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_COLUMN_HEADER_OPTIONS_0 = "GUI_COLUMN_HEADER_OPTIONS_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_ADD_KEY_0 = "GUI_ADD_KEY_0";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_DEFAULT_LOCALE_0 = "GUI_DEFAULT_LOCALE_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_RESOURCE_HAS_WRONG_TYPE_2 = "ERR_RESOURCE_HAS_WRONG_TYPE_2";
    /** Message constant for key in the resource bundle. */
    public static final String GUI_PLEASE_ADD_VALUE_0 = "GUI_PLEASE_ADD_VALUE_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_MODE_CHANGE_NOT_POSSIBLE_0 = "ERR_MODE_CHANGE_NOT_POSSIBLE_0";
    /** Message constant for key in the resource bundle. */
    public static final String ERR_BUNDLE_DESCRIPTOR_SEARCH_ERROR_0 = "ERR_BUNDLE_DESCRIPTOR_SEARCH_ERROR_0";

    /**
     * Hides the public constructor for this utility class.<p>
     */
    private Messages() {

        // hide the constructor
    }

    /**
     * Returns an instance of this localized message accessor.<p>
     *
     * @return an instance of this localized message accessor
     */
    public static I_CmsMessageBundle get() {

        return INSTANCE;
    }

    /**
     * @see org.opencms.i18n.I_CmsMessageBundle#getBundleName()
     */
    public String getBundleName() {

        return BUNDLE_NAME;
    }
}