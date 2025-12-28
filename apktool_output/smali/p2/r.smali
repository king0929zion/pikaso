.class public abstract Lp2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    instance-of v0, p0, Lq2/a;

    if-eqz v0, :cond_1

    instance-of v0, p0, Lq2/c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "kotlin.collections.MutableList"

    invoke-static {p0, v0}, Lp2/r;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    :try_start_0
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-class v0, Lp2/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lp2/g;->g(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    instance-of v0, p0, Lq2/a;

    if-eqz v0, :cond_1

    instance-of v0, p0, Lq2/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "kotlin.collections.MutableMap"

    invoke-static {p0, v0}, Lp2/r;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    :try_start_0
    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-class v0, Lp2/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lp2/g;->g(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p0
.end method

.method public static c(ILjava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-static {p0, p1}, Lp2/r;->d(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "kotlin.jvm.functions.Function"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lp2/r;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static d(ILjava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lc2/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    instance-of v0, p1, Lp2/e;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    check-cast p1, Lp2/e;

    invoke-interface {p1}, Lp2/e;->e()I

    move-result p1

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lo2/a;

    if-eqz v0, :cond_1

    move p1, v1

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lo2/c;

    if-eqz v0, :cond_2

    move p1, v2

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lo2/e;

    if-eqz v0, :cond_3

    const/4 p1, 0x2

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Lo2/f;

    if-eqz v0, :cond_4

    const/4 p1, 0x3

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, Lo2/g;

    if-eqz v0, :cond_5

    const/4 p1, 0x4

    goto/16 :goto_0

    :cond_5
    instance-of p1, p1, LL/a;

    if-eqz p1, :cond_6

    const/4 p1, 0x5

    goto :goto_0

    :cond_6
    if-eqz p1, :cond_7

    const/4 p1, 0x6

    goto :goto_0

    :cond_7
    if-eqz p1, :cond_8

    const/4 p1, 0x7

    goto :goto_0

    :cond_8
    if-eqz p1, :cond_9

    const/16 p1, 0x8

    goto :goto_0

    :cond_9
    if-eqz p1, :cond_a

    const/16 p1, 0x9

    goto :goto_0

    :cond_a
    if-eqz p1, :cond_b

    const/16 p1, 0xa

    goto :goto_0

    :cond_b
    if-eqz p1, :cond_c

    const/16 p1, 0xb

    goto :goto_0

    :cond_c
    if-eqz p1, :cond_d

    const/16 p1, 0xd

    goto :goto_0

    :cond_d
    if-eqz p1, :cond_e

    const/16 p1, 0xe

    goto :goto_0

    :cond_e
    if-eqz p1, :cond_f

    const/16 p1, 0xf

    goto :goto_0

    :cond_f
    if-eqz p1, :cond_10

    const/16 p1, 0x10

    goto :goto_0

    :cond_10
    if-eqz p1, :cond_11

    const/16 p1, 0x11

    goto :goto_0

    :cond_11
    if-eqz p1, :cond_12

    const/16 p1, 0x12

    goto :goto_0

    :cond_12
    if-eqz p1, :cond_13

    const/16 p1, 0x13

    goto :goto_0

    :cond_13
    if-eqz p1, :cond_14

    const/16 p1, 0x14

    goto :goto_0

    :cond_14
    if-eqz p1, :cond_15

    const/16 p1, 0x15

    goto :goto_0

    :cond_15
    const/4 p1, -0x1

    :goto_0
    if-ne p1, p0, :cond_16

    move v1, v2

    :cond_16
    return v1
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be cast to "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    const-class p0, Lp2/r;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lp2/g;->g(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method
