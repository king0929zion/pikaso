.class public final LG1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/accessibilityservice/AccessibilityService$TakeScreenshotCallback;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lp2/m;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lp2/m;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG1/k;->a:Ljava/lang/String;

    iput-object p2, p0, LG1/k;->b:Ljava/lang/String;

    iput-object p3, p0, LG1/k;->c:Lp2/m;

    iput-object p4, p0, LG1/k;->d:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final onFailure(I)V
    .locals 1

    iget-object p1, p0, LG1/k;->c:Lp2/m;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lp2/m;->d:Z

    iget-object p1, p0, LG1/k;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final onSuccess(Landroid/accessibilityservice/AccessibilityService$ScreenshotResult;)V
    .locals 5

    const-string v0, "screenshotResult"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LG1/i;->h(Landroid/accessibilityservice/AccessibilityService$ScreenshotResult;)Landroid/hardware/HardwareBuffer;

    move-result-object v0

    const-string v1, "getHardwareBuffer(...)"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LG1/i;->e(Landroid/accessibilityservice/AccessibilityService$ScreenshotResult;)Landroid/graphics/ColorSpace;

    move-result-object p1

    const-string v1, "getColorSpace(...)"

    invoke-static {p1, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LC1/a;->c(Landroid/hardware/HardwareBuffer;Landroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0}, Landroid/hardware/HardwareBuffer;->close()V

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, LG1/k;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object v2, p0, LG1/k;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, 0x19be1

    if-eq v3, v4, :cond_4

    const v4, 0x1b229

    if-eq v3, v4, :cond_2

    const v4, 0x31e068

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "jpeg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_2
    const-string v3, "png"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_2

    :cond_4
    const-string v3, "jpg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_2

    :cond_5
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    :goto_2
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget-object v1, p0, LG1/k;->c:Lp2/m;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    if-ne v2, v4, :cond_6

    const/16 v4, 0x5a

    goto :goto_3

    :cond_6
    const/16 v4, 0x64

    :goto_3
    invoke-virtual {p1, v2, v4, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v2

    iput-boolean v2, v1, Lp2/m;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_7

    :catchall_1
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v3

    :try_start_5
    invoke-static {v1, v3}, LZ0/d;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_5
    throw v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    :try_start_6
    iget-object v1, p0, LG1/k;->c:Lp2/m;

    iput-boolean v0, v1, Lp2/m;->d:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    :goto_6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    throw v0

    :cond_7
    iget-object p1, p0, LG1/k;->c:Lp2/m;

    iput-boolean v0, p1, Lp2/m;->d:Z

    :goto_7
    iget-object p1, p0, LG1/k;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
