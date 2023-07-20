package com.example.cryptoapp.domain

class loadDataUseCase(
    private val repository: CoinRepository
) {
    operator fun invoke() = repository.loadData()
}