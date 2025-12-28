.class public final LE/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Class;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LE/z;->a:I

    .line 4
    iput-object p2, p0, LE/z;->d:Ljava/lang/Object;

    .line 5
    iput p3, p0, LE/z;->c:I

    .line 6
    iput p4, p0, LE/z;->b:I

    return-void
.end method

.method public constructor <init>(LE/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE/z;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    iget-object v0, p0, LE/z;->d:Ljava/lang/Object;

    check-cast v0, LE/A;

    iget-object v0, v0, LE/A;->d:[I

    iget v1, p0, LE/z;->b:I

    add-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public b(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LE/z;->d:Ljava/lang/Object;

    check-cast v0, LE/A;

    iget-object v0, v0, LE/A;->f:[Ljava/lang/Object;

    iget v1, p0, LE/z;->c:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method
