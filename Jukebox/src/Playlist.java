import java.util.Queue;

/**
 * Created by Chao on 2017/8/24.
 */
public class Playlist {
    private Song song;
    private Queue<Song> queue;
    public Song getNextSongToPlay() {
        return queue.peek();
    }
    public void queueUpSong(Song s) {
        queue.offer(s);
    }
}
