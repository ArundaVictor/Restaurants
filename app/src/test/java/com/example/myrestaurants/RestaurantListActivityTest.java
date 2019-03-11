package com.example.myrestaurants;
import android.widget.ListView;

import com.example.myrestaurants.ui.RestaurantListActivity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

//@RunWith(RobolectricGradleTestRunner.class)

public class RestaurantListActivityTest {
    private RestaurantListActivity activity;
    private ListView mRestaurantListView;

//    @Before
//    public void setup() {
//        activity = Robolectric.setupActivity(RestaurantListActivity.class);
//        mRestaurantListView = (ListView) activity.findViewById(R.id.listView);
//    }

    @Test
    public void restaurantListViewPopulates() {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
    }
}