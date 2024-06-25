package com.hassan.langlocal;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class SharedPrefClass {
    Context context;
    public String PINLOCK_KEY="audioUri";
    public String LANGUAGE_TYPE_KEY="languagetype2";
    public String LOCK_KEY="applock2";
    public String NOTIFICATION_KEY="notilock2";
    public String THEME_KEY="themekey2";
    public String SHARED_KEY="MySharedPreferences2";
    public String USER_STATUS_KEY="userstatus2";
    public String USER_MOBILE_KEY="userphonenumber2";
    public String SELECTED_BOOK_KEY="selectedBookId2";
    public String SELECTED_FILTER_KEY="selectedfilterkey2";
    public String SELECTED_DURATION_KEY="selecteddurationkey2";
    public String START_DATE_KEY="startdatekey2";
    public String END_DATE_KEY="enddatekey2";
    public String VIDEO_DURATION_KEY="videodurtation";
    public String AUDIO_DURATION_KEY="Audioduration";
    public String VIDEO_VOLUME_KEY="VideoVolumeKey";
    public String AUDIO_VOLUME_KEY="AudioVolumeKey";
    public String AUDIO_STARTPOS_KEY="AudioVoly";
    public String AUDIO_ENDPOS_KEY="AuolumeKey";
    public String VIDEO_STARTPOS_KEY="VideoStartPosKey";
    public String VIDEO_ENDPOS_KEY="VideoEndPosKey";
    public String TEMP_CREATED_VIDEO="temporarycreateedvideo";
    public String AUDIO_FILE_SIZE="nsadjfuisaduiacnashdfas";
    public String OUTPUT_URI="najdfnasdjncsdf";
    public String JUGAAD_KEY="Jugaadkeytohandlefirsttime";

    public SharedPrefClass(Context context) {
        this.context = context;
    }



    public boolean getThemeStatefromShared(){
        boolean status=context.getSharedPreferences(SHARED_KEY,MODE_PRIVATE).getBoolean(THEME_KEY,false);
        return status;
    }
    public void saveLanguageCodeinShared(String value){
        SharedPreferences.Editor myEdit = context.getSharedPreferences(SHARED_KEY, MODE_PRIVATE).edit();
        myEdit.putString(LANGUAGE_TYPE_KEY,value);
        myEdit.apply();
    }
    public String getLanguageCodefromShared(String degault){
        String status=context.getSharedPreferences(SHARED_KEY,MODE_PRIVATE).getString(LANGUAGE_TYPE_KEY,degault);
        return status;
    }

}