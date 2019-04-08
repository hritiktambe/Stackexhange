package com.hritiktambe.pracstack.api;

import com.hritiktambe.pracstack.models.Stack;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("search")
    Call<Stack> getStackSearch(

            @Query("order") String order ,
            @Query("sort") String sort,
            @Query("tagged") String tagged,
            @Query("site") String site

    );



}
