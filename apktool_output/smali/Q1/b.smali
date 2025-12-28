.class public final LQ1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ1/c;


# instance fields
.field public a:Ljava/lang/Long;


# virtual methods
.method public final a()Z
    .locals 6

    iget-object v0, p0, LQ1/b;->a:Ljava/lang/Long;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    :try_start_0
    const-class v0, Landroid/os/Build;

    const-string v2, "getLong"

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v2, "ro.build.version.oneui"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    iput-object v0, p0, LQ1/b;->a:Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v2, -0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LQ1/b;->a:Ljava/lang/Long;

    :cond_0
    :goto_0
    iget-object v0, p0, LQ1/b;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0x9ca4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method
