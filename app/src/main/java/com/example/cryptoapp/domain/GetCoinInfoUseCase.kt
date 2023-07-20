package com.example.cryptoapp.domain

class GetCoinInfoUseCase(
    private val repository: CoinRepository
) {
    suspend operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}