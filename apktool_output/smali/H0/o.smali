.class public abstract Lh0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/f;

.field public static final b:[Ljava/lang/StackTraceElement;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh0/f;

    sget-object v1, Ld2/s;->d:Ld2/s;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh0/f;-><init>(Ljava/util/List;LB2/i;)V

    sput-object v0, Lh0/o;->a:Lh0/f;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    sput-object v0, Lh0/o;->b:[Ljava/lang/StackTraceElement;

    return-void
.end method
