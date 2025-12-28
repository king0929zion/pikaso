.class public final LA0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LA0/d;->a:Landroid/view/View;

    .line 3
    new-instance p1, LA0/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, LZ/b;->B(Lo2/a;)Lc2/d;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lo0/u;)V
    .locals 4

    .line 4
    new-instance p2, LA0/d;

    invoke-direct {p2, p1}, LA0/d;-><init>(Landroid/view/View;)V

    .line 5
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LA0/d;->a:Landroid/view/View;

    .line 8
    new-instance p1, LA0/e;

    .line 9
    sget-wide v0, Lv0/A;->b:J

    .line 10
    new-instance p2, Lv0/c;

    .line 11
    const-string v2, ""

    const/4 v3, 0x0

    invoke-direct {p2, v2, v3, v3, v3}, Lv0/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 12
    invoke-direct {p1, p2, v0, v1, v3}, LA0/e;-><init>(Lv0/c;JLv0/A;)V

    .line 13
    sget p1, LA0/b;->g:I

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    new-instance p1, LA0/c;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, LZ/b;->B(Lo2/a;)Lc2/d;

    .line 16
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 17
    invoke-static {}, LW/D;->j()[F

    .line 18
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    return-void
.end method
