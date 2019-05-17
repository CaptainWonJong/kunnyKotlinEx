package com.androidhuman.example.simplegithub.extensions

import com.androidhuman.example.simplegithub.rx.AutoClearedDisposable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * CompositeDisposable의 '+-' 연산자 뒤에 Disposable 타입이 오는 경우를 재정의
 */
operator fun AutoClearedDisposable.plusAssign(disposable: Disposable) = this.add(disposable)