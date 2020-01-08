package com.example.myslider;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface JavaPlaceHolderApi {
    @POST("")
    Call<DataAdapter>cardPost(@Body DataAdapter dataAdapter);

}
