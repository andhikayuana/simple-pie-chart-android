# Simple Pie Chart Android

Simple PieChartView for Android

![](example.png?raw=true)

## Installation

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

```gradle
dependencies {
    implementation 'com.github.andhikayuana:simple-pie-chart-android:e7d9622aa9'
}
```

## Usage

you can use like this
```xml
<id.yuana.chart.pie.PieChartView
        android:id="@+id/pieChart"
        android:layout_width="200dp"
        android:layout_height="200dp" />
```

```java
pieChart.setDataPoints(floatArrayOf(450F, 1230F, 200F, 400F))
pieChart.setCenterColor(R.color.light_pink)
pieChart.setSliceColor(intArrayOf(
                R.color.duck_egg_blue_two,
                R.color.soft_pink,
                R.color.washed_out_green,
                R.color.sunshine_yellow))
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## Todos

1. ?

## License

MIT License

Copyright (c) 2018 Andhika Yuana

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
