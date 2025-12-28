.class public abstract Landroidx/compose/ui/draw/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LP/l;Lb0/b;LP/d;Ll0/d;FLW/l;)LP/l;
    .locals 8

    new-instance v7, Landroidx/compose/ui/draw/PainterElement;

    const/4 v2, 0x1

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/draw/PainterElement;-><init>(Lb0/b;ZLP/d;Ll0/d;FLW/l;)V

    invoke-interface {p0, v7}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method
