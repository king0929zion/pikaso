.class public final LJ1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/J;


# instance fields
.field public a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILp/r;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, LJ1/b;->a:I

    .line 20
    iput p2, p0, LJ1/b;->b:I

    .line 21
    new-instance v0, LD1/w;

    .line 22
    new-instance v1, Lp/v;

    invoke-direct {v1, p1, p2, p3}, Lp/v;-><init>(IILp/r;)V

    .line 23
    invoke-direct {v0, v1}, LD1/w;-><init>(Lp/t;)V

    iput-object v0, p0, LJ1/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 6

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LJ1/b;->c:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, LJ1/b;->b:I

    .line 6
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 7
    sget-object v0, LO0/p;->g:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 9
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 10
    iget v3, p0, LJ1/b;->a:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, LJ1/b;->a:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 11
    iget v3, p0, LJ1/b;->b:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, LJ1/b;->b:I

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 14
    const-string v4, "layout"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 15
    new-instance v3, LO0/l;

    invoke-direct {v3}, LO0/l;-><init>()V

    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v2}, LO0/l;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ1/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c(Lp/n;Lp/n;Lp/n;)J
    .locals 2

    iget p1, p0, LJ1/b;->b:I

    iget p2, p0, LJ1/b;->a:I

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public e(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 7

    iget-object v0, p0, LJ1/b;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LD1/w;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LD1/w;->e(JLp/n;Lp/n;Lp/n;)Lp/n;

    move-result-object p1

    return-object p1
.end method

.method public f(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 7

    iget-object v0, p0, LJ1/b;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LD1/w;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LD1/w;->f(JLp/n;Lp/n;Lp/n;)Lp/n;

    move-result-object p1

    return-object p1
.end method
