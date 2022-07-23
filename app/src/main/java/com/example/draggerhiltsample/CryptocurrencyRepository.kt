package com.example.draggerhiltsample

interface CryptocurrencyRepository {
    fun getCryptoCurrency() : List<Cryptocurrency>;
}