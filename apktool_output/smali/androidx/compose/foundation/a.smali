.class public abstract Landroidx/compose/foundation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LP/l;JLW/H;)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/BackgroundElement;

    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLW/H;)V

    invoke-interface {p0, v0}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(LP/l;Ls/g;Lq/C;ZLA0/c;)LP/l;
    .locals 8

    instance-of v0, p2, Lq/H;

    const/4 v6, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    move-object v3, p2

    check-cast v3, Lq/H;

    new-instance p2, Landroidx/compose/foundation/ClickableElement;

    move-object v1, p2

    move-object v2, p1

    move v4, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Landroidx/compose/foundation/ClickableElement;

    const/4 v3, 0x0

    move-object v1, p2

    move-object v2, p1

    move v4, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {p1, p2}, Landroidx/compose/foundation/c;->a(Ls/g;Lq/C;)LP/l;

    move-result-object p2

    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, p1

    move v4, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V

    invoke-interface {p2, v0}, LP/l;->c(LP/l;)LP/l;

    move-result-object p2

    goto :goto_0

    :cond_2
    new-instance p1, Landroidx/compose/foundation/b;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, v5

    move-object v5, v6

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/b;-><init>(Lq/C;ZLjava/lang/String;Lt0/e;LA0/c;)V

    new-instance p2, LP/g;

    invoke-direct {p2, p1}, LP/g;-><init>(Lo2/f;)V

    :goto_0
    invoke-interface {p0, p2}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method
