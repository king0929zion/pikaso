.class public abstract Landroidx/compose/foundation/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/foundation/layout/FillElement;

.field public static final b:Landroidx/compose/foundation/layout/FillElement;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    const/4 v1, 0x2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/FillElement;-><init>(IF)V

    sput-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/FillElement;-><init>(IF)V

    sput-object v0, Landroidx/compose/foundation/layout/b;->b:Landroidx/compose/foundation/layout/FillElement;

    return-void
.end method

.method public static final a(FF)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;-><init>(FF)V

    return-object v0
.end method

.method public static final b(LP/l;Lt/p;)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/PaddingValuesElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/layout/PaddingValuesElement;-><init>(Lt/p;)V

    invoke-interface {p0, v0}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method

.method public static final c(F)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {v0, p0, p0, p0, p0}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    return-object v0
.end method

.method public static d(LP/l;F)LP/l;
    .locals 2

    const/4 v0, 0x0

    int-to-float v0, v0

    new-instance v1, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {v1, p1, v0, p1, v0}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    invoke-interface {p0, v1}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method

.method public static e(LP/l;F)LP/l;
    .locals 4

    const/4 v0, 0x0

    int-to-float v1, v0

    int-to-float v2, v0

    int-to-float v0, v0

    new-instance v3, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {v3, v1, p1, v2, v0}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    invoke-interface {p0, v3}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    return-object p0
.end method

.method public static final f(F)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    invoke-direct {v0, p0, p0, p0, p0}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFF)V

    return-object v0
.end method
