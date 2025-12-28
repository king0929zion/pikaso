.class public interface abstract LP/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/l;


# virtual methods
.method public a(Lo2/c;)Z
    .locals 0

    invoke-interface {p1, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
