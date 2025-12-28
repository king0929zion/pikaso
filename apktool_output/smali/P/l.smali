.class public interface abstract LP/l;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lo2/c;)Z
.end method

.method public abstract b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
.end method

.method public c(LP/l;)LP/l;
    .locals 1

    sget-object v0, LP/i;->a:LP/i;

    if-ne p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LP/f;

    invoke-direct {v0, p0, p1}, LP/f;-><init>(LP/l;LP/l;)V

    :goto_0
    return-object v0
.end method
