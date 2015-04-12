package io.druid.data.input;



/**
 * Committer includes a Runnable and a Jackson-serialized metadata object containing the offset
 */
public interface Committer extends Runnable
{
    public Object getMetadata();
}
