/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the transcription tracks in the output of a Live Event, generated
 * using speech-to-text transcription.
 */
public class LiveEventTranscription {
    /**
     * Specifies the language (locale) used for speech-to-text transcription �
     * it should match the spoken language in the audio track. The value should
     * be in BCP-47 format of 'language tag-region' (e.g: 'en-US'). The list of
     * supported languages are 'en-US' and 'en-GB'.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Provides a mechanism to select the audio track in the input live feed,
     * to which speech-to-text transcription is applied.
     */
    @JsonProperty(value = "inputTrackSelection")
    private List<LiveEventInputTrackSelection> inputTrackSelection;

    /**
     * Describes a transcription track in the output of a Live Event, generated
     * using speech-to-text transcription.
     */
    @JsonProperty(value = "outputTranscriptionTrack")
    private LiveEventOutputTranscriptionTrack outputTranscriptionTrack;

    /**
     * Get specifies the language (locale) used for speech-to-text transcription � it should match the spoken language in the audio track. The value should be in BCP-47 format of 'language tag-region' (e.g: 'en-US'). The list of supported languages are 'en-US' and 'en-GB'.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set specifies the language (locale) used for speech-to-text transcription � it should match the spoken language in the audio track. The value should be in BCP-47 format of 'language tag-region' (e.g: 'en-US'). The list of supported languages are 'en-US' and 'en-GB'.
     *
     * @param language the language value to set
     * @return the LiveEventTranscription object itself.
     */
    public LiveEventTranscription withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get provides a mechanism to select the audio track in the input live feed, to which speech-to-text transcription is applied.
     *
     * @return the inputTrackSelection value
     */
    public List<LiveEventInputTrackSelection> inputTrackSelection() {
        return this.inputTrackSelection;
    }

    /**
     * Set provides a mechanism to select the audio track in the input live feed, to which speech-to-text transcription is applied.
     *
     * @param inputTrackSelection the inputTrackSelection value to set
     * @return the LiveEventTranscription object itself.
     */
    public LiveEventTranscription withInputTrackSelection(List<LiveEventInputTrackSelection> inputTrackSelection) {
        this.inputTrackSelection = inputTrackSelection;
        return this;
    }

    /**
     * Get describes a transcription track in the output of a Live Event, generated using speech-to-text transcription.
     *
     * @return the outputTranscriptionTrack value
     */
    public LiveEventOutputTranscriptionTrack outputTranscriptionTrack() {
        return this.outputTranscriptionTrack;
    }

    /**
     * Set describes a transcription track in the output of a Live Event, generated using speech-to-text transcription.
     *
     * @param outputTranscriptionTrack the outputTranscriptionTrack value to set
     * @return the LiveEventTranscription object itself.
     */
    public LiveEventTranscription withOutputTranscriptionTrack(LiveEventOutputTranscriptionTrack outputTranscriptionTrack) {
        this.outputTranscriptionTrack = outputTranscriptionTrack;
        return this;
    }

}
