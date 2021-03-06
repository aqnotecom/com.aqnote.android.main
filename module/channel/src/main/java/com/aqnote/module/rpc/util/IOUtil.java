package com.aqnote.module.rpc.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOUtil {
    public static String readFully(InputStream inputStream) throws IOException {

        if(inputStream == null) {
            return "";
        }

        BufferedInputStream bufferedInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            byteArrayOutputStream = new ByteArrayOutputStream();

            final byte[] buffer = new byte[1024];
            int available = 0;

            while ((available = bufferedInputStream.read(buffer)) >= 0) {
                byteArrayOutputStream.write(buffer, 0, available);
            }

            return byteArrayOutputStream.toString();

        } finally {
            if(bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        }
    }

    public static Bitmap readImage(InputStream inputStream) throws IOException {

        if(inputStream == null) {
            return null;
        }
//
//        BufferedInputStream bufferedInputStream = null;
//        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
//            bufferedInputStream = new BufferedInputStream(inputStream);
//            byteArrayOutputStream = new ByteArrayOutputStream();
//
//            final byte[] buffer = new byte[1024];
//            int available = 0;
//
//            while ((available = bufferedInputStream.read(buffer)) >= 0) {
//                byteArrayOutputStream.write(buffer, 0, available);
//            }
//

            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;
        } finally {
//            if(bufferedInputStream != null) {
//                bufferedInputStream.close();
//            }
        }
    }
}
