package com.lab.config;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {
    @Bean
    public S3Client s3Client() {
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create(
                "", // replace with your actual access key
                ""  // replace with your actual secret key
                //Keys deleted after testing, for obvious reasons
        );

        return S3Client.builder()
                .region(Region.of("eu-central-1")) // replace with your region,
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();
    }
}
