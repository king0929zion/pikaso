.class public abstract Lw2/h;
.super Lw2/i;
.source "SourceFile"


# direct methods
.method public static X(Lw2/d;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lw2/c;

    invoke-direct {v0, p0}, Lw2/c;-><init>(Lw2/d;)V

    invoke-virtual {v0}, Lw2/c;->hasNext()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lw2/c;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static Y(Ljava/lang/Object;Lo2/c;)Lw2/f;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lw2/b;->a:Lw2/b;

    goto :goto_0

    :cond_0
    new-instance v0, Lw2/e;

    new-instance v1, LA0/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1, p1}, Lw2/e;-><init>(LA0/c;Lo2/c;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static Z(Lw2/f;Lo2/c;)Lw2/d;
    .locals 1

    new-instance v0, Lw2/e;

    invoke-direct {v0, p0, p1}, Lw2/e;-><init>(Lw2/f;Lo2/c;)V

    new-instance p0, Lw2/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1, v0}, Lw2/d;-><init>(ILjava/lang/Object;)V

    return-object p0
.end method

.method public static a0(Lw2/f;)Ljava/util/List;
    .locals 2

    invoke-interface {p0}, Lw2/f;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Ld2/s;->d:Ld2/s;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, LZ/b;->D(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
