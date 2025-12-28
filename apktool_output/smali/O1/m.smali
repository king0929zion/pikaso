.class public final Lo1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    sget v1, LZ0/e;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-static {}, Lo1/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object v0

    invoke-virtual {v0}, Lo1/i;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    sget v1, LZ0/e;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method
