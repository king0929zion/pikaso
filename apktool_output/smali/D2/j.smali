.class public final synthetic LD2/j;
.super Lp2/l;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# virtual methods
.method public final b()Lv2/a;
    .locals 1

    sget-object v0, Lp2/p;->a:Lp2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp2/b;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
