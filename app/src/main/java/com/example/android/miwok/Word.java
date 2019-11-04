package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**Default translation for the word*/
    private String mDefaultTranslation;

    /**Miwok translation for the word*/
    private String mMiwokTranslation;

    private static int NO_IMAGE_PROVIDED = -1;

    private static int NO_AUDIO_PROVIDED = -1;

    /**Resource ID for related Image*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getAudioResourceID() { return mAudioResourceID; }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @param miwokTranslation is the word in Miwok language
     * @param defaultTranslation is the word in the user's native language (i.e. English)
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceAudioID){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceID = resourceAudioID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceImageID, int resourceAudioID){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceID = resourceImageID;
        this.mAudioResourceID = resourceAudioID;
    }
}
