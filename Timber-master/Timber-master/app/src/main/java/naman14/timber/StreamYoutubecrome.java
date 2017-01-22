package naman14.timber;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;

import com.naman14.timber.R;

public class StreamYoutubecrome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_youtubecrome);
        Intent intent = getIntent();
        String output=intent.getStringExtra("check");
        output.replaceAll(" ","+");
        String url="https://www.youtube.com/results?search_query=+"+output;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));

    }
}
