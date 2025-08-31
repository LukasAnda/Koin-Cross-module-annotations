package org.example.app.shared.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module

@ComponentScan("org.example**")
@Configuration
@Module
class AppModule