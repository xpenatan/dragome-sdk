// Generated by esidl 0.4.0.

package org.w3c.dom.html;

public interface AudioTrackList
{
    // AudioTrackList
    public int getLength();
    public AudioTrack getElement(int index);
    public AudioTrack getTrackById(String id);
    public Function getOnchange();
    public void setOnchange(Function onchange);
}
